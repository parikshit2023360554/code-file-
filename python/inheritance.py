class person:
    def __init__(self,fname,lname):
        self.fname=fname
        self.lname=lname
    def printname(self):
        print(self.lname,self.fname)
        
x=person("parikshit","singh")
x.printname()