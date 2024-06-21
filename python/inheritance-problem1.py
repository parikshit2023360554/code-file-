
# 1= create a class with instance attributes
# 2= create a vehicle class without any variable and methods
# 3= create a child class bus that will inherit all of the variable and method of the vehicle class
# 4= class inheitance create argument of capacity
from typing import Any


class vehicle():
    def __init__(self,name,max_speed,mileage):
        self.name=name
        self.max_speed=max_speed
        self.mileage=mileage
    def seating_capacity(self,capacity):
        return f"the seating capacity of the {self.name} is {capacity} passanger" 
        
class bus(vehicle):
    def seating_capacity(self,capacity=50):
        return super().seating_capacity(capacity=50)
    

#define a class atribute color with a default value white every vehical should white

class vehicle:
    color= "white"
    def __init__(self,name,max_speed,mileage):
        self.name=name
        self.max_speed=max_speed
        self.mileage=mileage
    
class bus(vehicle):
    pass

class car(vehicle):
    pass

school_bus = bus("school volvo",180,12)
print(school_bus.color, school_bus.name, "speed: " ,school_bus.max_speed,"mileage: ",school_bus.mileage)


#create a bus child class that inherit from vehicle class. the default fare 
a="parikshit"
c=iter(a)
print(next(c))
print(next(c))