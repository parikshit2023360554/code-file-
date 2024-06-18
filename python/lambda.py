def myfunc(n):
    print(n)
    return(lambda a:a*n)
d=myfunc(2)
print(d(11))