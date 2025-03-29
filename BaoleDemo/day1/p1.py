# print('hello')

if __name__ == '__main__':
    print('hello')
    # 缩进
    # 数字number，字符串str，布尔bool
    # 弱类型语言
    # a = 10
    # b = 3.14
    a,b,c,d,e = 10,3.14,'hello',True,4+3j
    # print(type(a))
    # print(type(b))
    print(a,b,type(a),type(b))
    print(c,d,type(c),type(d))
    print(e,type(e))

    print(5/4)
    print(5//4)
    print(2**3)
    print(8%3)

    #单行注释
    '''
    多行注释
    '''
    # array,list,string      index:0~length-1
    #String->hello   转成char[]  cs,   cs[1]
    print(c[0],c[-1])
    # 切片：    str[起点:终点]     起点默认0，终点默认结尾
    print('切片',c[1:])
    print('重复',c*2)
    print(c+" world")

    print('bool-------')
    # False: 0 , 0.0 , 0j, '',
    print(int(3.14))
    print(bool(0),bool(''),bool({}),bool([]))