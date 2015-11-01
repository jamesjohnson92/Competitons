def ColorChoice(m,n):
    fac = 1
    for i in range(1,int(n/2+1)):
        fac *= (((n+1) - i) / i)
        if fac >= m :
            return i
    return -1

print (ColorChoice(6,4))


