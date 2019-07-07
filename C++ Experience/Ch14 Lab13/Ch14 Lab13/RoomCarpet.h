// Specification file for the RoomCarpet class
#ifndef ROOM_CARPET_H
#define ROOM_CARPET_H
#include "RoomDimension.h"

class RoomCarpet
{
private:
	RoomDimension dimensions;  // declare an object called dimensions of the class RoomDimension 
	double cost;               // Cost per square foot

public:
	// Constructor
	RoomCarpet(RoomDimension rd, double c)
	{
		dimensions = rd;
		cost = c;
	}

	// getTotalCost function
	double getTotalCost()
	{
		length * width * cost = TotalCost;
	}
};

#endif
