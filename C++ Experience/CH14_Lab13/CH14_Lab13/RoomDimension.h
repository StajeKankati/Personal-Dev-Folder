#ifndef ROOMDIMENSION_H
#define ROOMDIMENSION_H

#include "FeetInches.h"

class RoomDimension
{
	double length;
	double width;
public: RoomDimension()
{}
		RoomDimension(FeetInches fiLength, FeetInches fiWidth)
		{
			length = fiLength.getInches();
			width = fiWidth.getInches();
		}
		double getArea()
		{
			return length*width;
		}

};
#endif ROOMDIMENSION_H
