

def find_square_of_elms(digits):
    return [ digit**2 for digit in digits]


def find_square_of_even_numbers(digits):
    return [ digit**2 for digit in digits if digit % 2 == 0]

def find_square_of_even_number_and_cube_of_add_number(digit):
    if digit % 2 == 0:
        return digit ** 2
    else:
        return digit ** 3



digits = [ x for x in range(10)]
print('List of digits')
print(digits)
squared_digits = find_square_of_elms(digits)
print('squared digits')
print(squared_digits)

print('Did digits change?') # It did not :)
print(digits)

squared_even_nos = find_square_of_even_numbers(digits)
print('squared even numbers')
print(squared_even_nos)

'''Note that the strategy is different here. We are calling function for each element'''
squared_even_nos_cubed_odd_nos = [find_square_of_even_number_and_cube_of_add_number(digit) for digit in digits]
print('squared even numbers cubed odd numbers')
print(squared_even_nos_cubed_odd_nos)
