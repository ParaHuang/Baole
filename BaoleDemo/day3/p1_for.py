
if __name__ == '__main__':
    '''
    # range(起点,终点,增量)  ,起点默认为0
    for i in range(10,20,2):
        print(i)

    for x in "hello":
        print(x)

    # collection，集合
    #       list： [11,55,66,99,888]
    for e in [11,55,66,99,888]:
        print(e)
    '''
    # 20世纪所有的闰年
    for year in range(1900,2000):
        if year%400==0 or year%4==0 and year%100!=0 :
            print(year)

    # 数学运算符 ：           +   -   *   /    //   %
    # 关系运算符：            >   >=   <   <=   ==  !=
    # 逻辑运算符：            not    and    or
    # 赋值运算符：            =   +=   -=    *=    /=

    # x = 10
    # x+=4      # x = x+4

    # unary operator
    # binary operator
    # ternary operator
    print(not True)
    print(True and True)

    # System.out.println(1 > 5?"hello": "hey");
    # A ? B : C
    # B if A else C
    print("hello" if 1<5 else "hey")