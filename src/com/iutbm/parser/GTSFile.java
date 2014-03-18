package com.iutbm.parser;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GTSFile {
	private int nbPoints, nbEdges, nbTriangles;
	private List<Point> points;
	private List<Edge> edges;
	private List<Triangle> triangles;

	@SuppressWarnings("resource")
	public GTSFile(String path) {
		File gts;
		InputStreamReader isr;
		BufferedReader br;
		String line = "";
		try {
			gts = new File(path);
			isr = new InputStreamReader(new BufferedInputStream(
					new FileInputStream(gts)));
			br = new BufferedReader(isr);
			line = br.readLine();

			nbPoints = Integer.parseInt(line.split(" ")[0]);
			nbEdges = Integer.parseInt(line.split(" ")[1]);
			nbTriangles = Integer.parseInt(line.split(" ")[2]);

			points = new ArrayList<Point>();
			edges = new ArrayList<Edge>();
			triangles = new ArrayList<Triangle>();

			int n = 0;
			double x, y, z;
			Point a, b;
			Edge c, d, e;
			while ((line = br.readLine()) != null) {
				n += 1;
				if (n <= nbPoints) {
					x = Double.parseDouble(line.split(" ")[0]);
					y = Double.parseDouble(line.split(" ")[1]);
					z = Double.parseDouble(line.split(" ")[2]);
					points.add(new Point(x, y, z));
				} else if (n <= (nbPoints + nbEdges)) {
					a = points.get(Integer.parseInt(line.split(" ")[0]) - 1);
					b = points.get(Integer.parseInt(line.split(" ")[1]) - 1);
					edges.add(new Edge(a, b));
				} else if (n <= (nbPoints + nbEdges + nbTriangles)) {
					c = edges.get(Integer.parseInt(line.split(" ")[0]) - 1);
					d = edges.get(Integer.parseInt(line.split(" ")[1]) - 1);
					e = edges.get(Integer.parseInt(line.split(" ")[2]) - 1);
					triangles.add(new Triangle(c, d, e));
				} else
					throw new Exception("Le fichier n'est pas valide");
			}

			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	}

	public int getNbPoints() {
		return nbPoints;
	}

	public void setNbPoints(int nbPoints) {
		this.nbPoints = nbPoints;
	}

	public int getNbEdges() {
		return nbEdges;
	}

	public void setNbEdges(int nbEdges) {
		this.nbEdges = nbEdges;
	}

	public int getNbTriangles() {
		return nbTriangles;
	}

	public void setNbTriangles(int nbTriangles) {
		this.nbTriangles = nbTriangles;
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public List<Edge> getEdges() {
		return edges;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

	public List<Triangle> getTriangles() {
		return triangles;
	}

	public void setTriangles(List<Triangle> triangles) {
		this.triangles = triangles;
	}
}