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

    perms = [[x11, y11, z11] for x11 in x1 for y11 in y1 for z11 in z1 if (x11+y11+z11) != n]
                
    print('Final list')
    print(perms)
