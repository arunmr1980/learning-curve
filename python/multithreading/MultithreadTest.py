import threading
import random
import string
import time

def say_hello(index):
    print('Thread['+str(index)+'] starting ....')
    print('Hello ' + get_random_string())
    time.sleep(4)
    print('Thread['+str(index)+'] stopping ....')


def get_random_string():
    N = 7
    res = ''.join(random.choices(string.ascii_uppercase + string.digits, k = N))
    return(str(res))


if __name__ == "__main__":
    count = 0
    threads = []
    while count < 5:
        thread = threading.Thread(target=say_hello, args=(count,))
        threads.append(thread)
        count = count + 1
        thread.start()

    for thread in threads:
        thread.join()
