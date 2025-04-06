import random

if __name__ == '__main__':
    # # 石头、剪刀、步
    # # ctrl+/
    user = int(input("请选择：1-石头  2-剪刀  3-布："))
    if user == 1:
        print("用户选择了石头")
    elif user == 2:
        print("用户选择了剪刀")
    else:
        print("用户选择了布")
    # print(1=='1')

    # 电脑
    cmp = random.randint(1,3)
    print(cmp)
    # 显示电脑的选择
    match cmp:
        case 1:
            print("电脑选择了石头")
        case 2:
            print("电脑选择了剪刀")
        case _:
            print("电脑选择了布")

    # 处理输赢
    if user == cmp:
        print("draw game")
    elif user == 1 and cmp == 2 or user == 2 and cmp == 3 or user == 3 and cmp == 1:
        print("user win")
    else:
        print('pc wins')