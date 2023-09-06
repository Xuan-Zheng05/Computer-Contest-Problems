k = int(input())
code = input()
alphabet = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z']

def moveBack(s, letter):
    for i in range(s):
        if not letter == "A":
            letter = alphabet[alphabet.index(letter)-1]
        else:
            letter = "Z"
    return letter

output = ""
for i in range(len(code)):
    output += moveBack((i+1)*3+k,code[i])
print(output)