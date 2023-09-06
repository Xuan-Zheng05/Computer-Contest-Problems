plan = [[False for i in range(500)] for j in range(500)]
coords = [0, 1]
plan[coords[1] + 250][coords[0] + 250] = True

existingWell = [["d", "2"], ["r", "3"], ["d", "2"], ["r", "2"], ["u", "2"], ["r", "2"], ["d", "4"], ["l", "8"], ["u", "2"]]

quit = False
flag = False

def dig(instructions):
    global coords
    global flag
    global quit

    if instructions[0] == "u":
        for i in range(int(instructions[1])):
            coords[1] -= 1
            if plan[coords[1] + 250][coords[0] + 250]:
                flag = True
            plan[coords[1] + 250][coords[0] + 250] = True
    elif instructions[0] == "d":
        for i in range(int(instructions[1])):
            coords[1] += 1
            if plan[coords[1] + 250][coords[0] + 250]:
                flag = True
            plan[coords[1] + 250][coords[0] + 250] = True
    elif instructions[0] == "l":
        for i in range(int(instructions[1])):
            coords[0] -= 1
            if plan[coords[1] + 250][coords[0] + 250]:
                flag = True
            plan[coords[1] + 250][coords[0] + 250] = True
    elif instructions[0] == "r":
        for i in range(int(instructions[1])):
            coords[0] += 1
            if plan[coords[1] + 250][coords[0] + 250]:
                flag = True
            plan[coords[1] + 250][coords[0] + 250] = True
    else:
        quit = True

for i in range(len(existingWell)):
    dig(existingWell[i])


while True:
    command = input().split(" ")
    dig(command)
    if quit:
        break
    elif flag:
        print(str(coords[0]) + " " + str(coords[1]*-1) + " DANGER")
        break
    else:
        print(str(coords[0]) + " " + str(coords[1]*-1) + " safe")

    # for i in range(len(plan)):
    #     for j in range(len(plan[i])):
    #         if coords[0] == j and coords[1] == i:
    #             print("O", end="")
    #         elif plan[i][j]:
    #             print("X", end="")
    #         else:
    #             print(" ", end="")
    #     print()