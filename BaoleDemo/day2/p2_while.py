import random

if __name__ == '__main__':
    '''
    # 打印5次hello             有限次循环的3要素（知道次数）
    i = 1                       # 初始值
    while i<=5:                 # 条件
        print("hello")
        i += 1                  # 增量
    '''

    # 猜数字
    secret_number = random.randint(1,100)
    guess = -1
    while guess != secret_number:
        guess = int(input("guess a number:"))
        if guess < secret_number:
            print("too small")
        elif guess>secret_number:
            print("too big")
        # else:
            # 剩余情况

    print("congratulation!!!")