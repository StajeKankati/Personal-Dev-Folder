#ifndef SHIP_H
#define SHIP_H
#include<iostream>
#include<string>

using namespace std;

class Ship
{
private:
	string name;
	string year;
public:
	Ship(string n, string y)
	{
		name = n;
		year = y;
	}
	string getname()
	{
		return name;
	}
	string getyear()
	{
		return year;
	}
	virtual void print()
	{
		cout <<"The Ship's Name: " << getname() << endl;
		cout <<"The Year built: " << getyear() << endl;
		cout << endl;
	}
};


class CruiseShip :public Ship
{
private:
	int MaxP;

public:
	CruiseShip(string n, string y, int p) : Ship(n, y)
	{
		MaxP = p;
	}
	virtual void print()
	{
		cout <<"The Ship's Name: " << getname() << endl;
		cout <<"The Maximum number passengers: " << MaxP << endl;
		cout << endl;
	}

};


class CargoShip :public Ship
{
private:
	int MaxT;

public:
	CargoShip(string n, string y, int t) : Ship(n, y)
	{
		MaxT = t;
	}
	virtual void print()
	{

		cout <<"The Ship's Name: " << getname() << endl;
		cout <<"The capacity: " << MaxT << "tonnage" << endl;
		cout << endl;
	}
};
#endif