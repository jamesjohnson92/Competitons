factorial = []
def generateList(n):
    factorial.append(1)
    factorial.append(1)
    for i in range(2,n+1):
        factorial.append(i * factorial[i-1])
def calculateFac(n,i):
    return int((factorial[n]) / (factorial[i] * factorial[n-i]))
def ColorChoice(m,n):
    for i in range(1,int(n/2)+1):
        if m == calculateFac(n,i):
            return i
    return -1

def checkChoose(m,n):
    generateList(n)
    return ColorChoice(m,n)

print (checkChoose(221,12))


