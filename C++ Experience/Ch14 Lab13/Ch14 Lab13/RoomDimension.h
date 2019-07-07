// Specification file for the RoomDimension class
#ifndef ROOM_DIMENSION_H
#define ROOM_DIMENSION_H
#include "FeetInches.h"

class RoomDimension
{
private:
	FeetInches length;  // The length of the room
	------------------;   // The width of the room
	------------------;    // The room's area

public:
	// Default constructor
	RoomDimension()
	{ }

	// Constructor
	RoomDimension(FeetInches len, FeetInches w)
	{
		length = len;
		width = w;
		area = len.multiply(w);
	}

	// Copy constructor
	RoomDimension(const RoomDimension &obj)
	{
		-------------------------- -
	}

	// getArea function
	FeetInches getArea()
	{
		----------------------
	}
};

#endif

