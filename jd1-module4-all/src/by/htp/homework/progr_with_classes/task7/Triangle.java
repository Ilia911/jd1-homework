package by.htp.homework.progr_with_classes.task7;

public class Triangle {

	private Point a;
	private Point b;
	private Point c;

	public Triangle() {
	}

	public Triangle(Point a, Point b, Point c) {

		// �?змененеие координат точек треугольника в случае совпадения его вершин
		if (a.equals(b) || a.equals(c)) {
			a.setX(a.getX() + b.getX() + c.getX() + 1);
		}
		if (b.equals(c)) {
			b.setX(b.getX() + a.getX() + c.getX() + 1);
		}
		// �?змененеие координат точек треугольника в случае, если все три точки
		// треугольника находятся на одной прямой
		if (Math.abs((a.getX() - c.getX()) * (b.getY() - c.getY())
				- (b.getX() - c.getX()) * (a.getY() - c.getY())) < 0.0000001) {
			b.setY(b.getY() + 1);
			}
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		result = prime * result + ((c == null) ? 0 : c.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		if (c == null) {
			if (other.c != null)
				return false;
		} else if (!c.equals(other.c))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
