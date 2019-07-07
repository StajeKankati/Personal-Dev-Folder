#ifndef ROOMCARPET_H
#define ROOMCARPET_H

#include "RoomDimension.h"

class RoomCarpet
{
	double cost;
	RoomDimension rDimension;

public:
	RoomCarpet(RoomDimension rm, double cost)
	{
		this->cost = cost;
		rDimension = rm;
	}

	double totalCost()
	{
		return rDimension.getArea()*cost;
	}
};
#endif ROOMCARPET_H
