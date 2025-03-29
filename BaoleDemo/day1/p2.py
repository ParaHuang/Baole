if __name__ == '__main__':
    x = 10
    '''
    if statement:
        operation 1
    else:
        operation 2
        
    if statementA:
        operation 1
    elif statementB:
        operation 2
    elif statementC:
        operation 3
    else:
        operation 4
        
        
    match...case...:探讨subject取值的可能性
    
    match subject:
        case value1:
            operation A
        case value2:
            operation B
        case value3:
            operation C
        case value4:
            operation D
        case _:   #剩余所有情况
            operation E  
    '''

    # 去保险柜取现金：两层   “hello”  - >   "2333"
    '''
    pwd1 = input("请输入第一个密码:")
    if pwd1 == "hello":
        print("进入第一个")
        pwd2 = input("请输入第二个密码：")
        if pwd2 == "2333":
            print("密码挣钱，取出现金")
        else:
            print("密码错误，请离开")
    else:
        print("密码错误，请离开")
    '''

    grade = 58          # 0～100
    # < 60      不及格
    # 60～69    及格
    # 70～80    良好
    # >=80      优秀
    if grade < 60:
        print("不及格")
    elif grade < 70:
        print("及格")
    elif grade < 80:
        print("良好")
    else:
        print("优秀")

    # grade
    # 61  62  67   69       ->6X
    # 71 79 -> 7X
    # 8X,9X,10X
    match grade//10:
        case 6:
            print("及格")
        case 7:
            print("良好")
        case 8,9,10:
            print("优秀")
        case _:
            print("不及格")


    # year = 2000   闰年
