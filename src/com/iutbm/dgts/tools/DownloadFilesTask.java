package com.iutbm.dgts.tools;

import android.os.AsyncTask;
import com.iutbm.dgts.Source;
import com.iutbm.dgts.exception.InvalidGTSFileException;
import com.iutbm.parser.GTSFile;

import java.net.URL;

/**
 * @author Jean
 * @version 30/03/2014
 */

public class DownloadFilesTask extends AsyncTask<URL, Integer, Long> {

    protected Long doInBackground(URL... urls) {
        int count = urls.length;
        long totalSize = 0;
        for (int i = 0; i < count; i++) {
            GTSFile autre = null;
            try {
                autre = new GTSFile(urls[i]);
            } catch (InvalidGTSFileException e) {
                e.printStackTrace();
                continue;
            }
            Source.CONTENU.put(urls[i].toString(),autre);
            totalSize += autre.getNbPoints();
            publishProgress((int) ((i / (float) count) * 100));
            // Escape early if cancel() is called
            if (isCancelled()) break;
        }
        return totalSize;
    }

    //protected void onProgressUpdate(Integer... progress) {
    //    setProgressPercent(progress[0]);
    //}

    protected void onPostExecute(Long result) {
        System.out.println("DONE: " + result);
    }
}
