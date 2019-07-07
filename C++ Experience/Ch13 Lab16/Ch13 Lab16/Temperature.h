#include <iostream>

using namespace std;

class Temperature
{
private:
	float temp;

public:
	void setTemp(float);
	bool isEthylFreezing(float);
	bool isEthylBoiling(float);
	bool isOxygenFreezing(float);
	bool isOxygenBoiling(float);
	bool isWaterFreezing(float);
	bool isWaterBoiling(float);
};
