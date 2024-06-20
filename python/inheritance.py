class person:
    def __init__(self,fname,lname):
        self.fname=fname
        self.lname=lname
    def printname(self):
        print(self.fname,self.lname)
        
x=person("parikshit","singh")
x.printname()
#__________________________________________inheriting the property of person classs
# class student(person):
#     pass

# x1=student("arnima","chakravarty")
# x1.printname()
#________________________________________

# class student(person):
#     def __init__(self,fname,lname):
#         person.__init__(self,fname,lname)
#         pass
        
# x2=student("chat","do")
# x2.printname()



#__________________________________________
#using the super function 

# class student(person):
#     def __init__(self, fname, lname):
#         super().__init__(fname, lname)
    
# x3=student("super","class")
# x3.printname()

#______________________________________________


class student(person):
    def __init__(self, fname, lname):
        super().__init__(fname, lname)
        self.graduationyear=2024
        
    def welcome(self):
        print("wecome {} {} to the class of {}".format(self.fname,self.lname,self.graduationyear))
        
x4=student("parikshit","singh")
x4.welcome()

