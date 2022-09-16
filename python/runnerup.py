
def find_largest(nos):
    largest = 0
    for n in nos:
        if n>largest:
            largest = n
    return largest


def remove_from_arr(arr, num):
    return [n for n in arr if n != num]


if __name__ == '__main__':
    print('Enter count of numbers')
    n = int(input())
    print('Enter numbers separated by space')
    arr = map(int, input().split())
    arr_lst = list(arr)
    top_score = find_largest(arr_lst)
    print('top_score ' + str(top_score))
    arr_lst = remove_from_arr(arr_lst, top_score)
    runner_up = find_largest(arr_lst)
    print ('runner_up ' + str(runner_up))
