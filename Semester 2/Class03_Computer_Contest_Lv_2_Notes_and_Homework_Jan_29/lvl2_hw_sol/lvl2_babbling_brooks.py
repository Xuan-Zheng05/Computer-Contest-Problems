streams = []
n = int(input())
for i in range(n):
    streams.append(int(input()))
while True:
    intp = int(input())
    if intp == 99:
        stream = int(input())
        percentage = int(input())/100
        left = streams[stream-1]*percentage
        right = streams[stream-1]-left
        streams[stream-1] = left
        streams.insert(stream, right)  
    if intp == 88:
        streamnum = int(input())
        streams[streamnum-1] = streams[streamnum-1]+streams[streamnum]
        streams.pop(streamnum)
    if intp == 77:
        for j in streams:
            print(round(j), end=" ")
        break