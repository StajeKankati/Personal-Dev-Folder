//Staje Kankati


#include<iostream>

using namespace std;

class Shape
{
public:
	float area;

};

class Rectangle: public Shape
{
public:
	int width;
	int length;
	Rectangle(int w, int l)
	{
		width = w;
		length = l;
		CalculateArea();
	}
	void CalculateArea()
	{
		area = width * length;
	}
};


class circle : public Shape
{
public:
	int radius;
	circle(int r)
	{
		radius = r;
		CalculateArea();
	}
	void CalculateArea()
	{
		area = 3.14 * radius * radius;
	}

};
class cuboid: public Rectangle
{
public:
	int height;
	float volume;
	cuboid(int l, int w, int h) :Rectangle(w, l)
	{
		height = h;
		volume = height * width * length;
	}
};
int main()
{
	Rectangle r(10, 5);
	cout << r.area << endl;
	circle c(10);
	cout << c.area << endl;
	cuboid cube(10, 5, 3);
	cout << cube.volume << " " << cube.area << endl;
};




	

