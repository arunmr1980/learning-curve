if __name__ == '__main__':
    print('Enter x')
    x = int(input())
    print('Enter y')
    y = int(input())
    print('Enter z')
    z = int(input())
    print('Enter n')
    n = int(input())
    
    x1 = [digit for digit in range(x+1)]
    y1 = [digit for digit in range(y+1)]
    z1 = [digit for digit in range(z+1)]
    
    print('x list')
    print(x1)
    print('y list')
    print(y1)
    print('z list')
    print(z1)

    #elms = [x, y, z]
    perms = []
    for elm1 in x1:
        for elm2 in y1:
            for elm3 in z1:
                if (elm1 + elm2 + elm3) != n:
                    perms.append([elm1, elm2, elm3])
                
    print('Final list')
    print(perms)
