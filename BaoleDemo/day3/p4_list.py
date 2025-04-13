if __name__ == '__main__':
    list = [11,33,66,44,22,33]
    print(list)
    # 通过index直接操作元素
    print(list[0],list[-1])
    # slice,切片
    # list[起点:终点:增量]
    print(list[1:-1:2])
    print(list[1::2])
    print(list[::2])
    # python内置方法
    print('长度',len(list))

    for i in range(len(list)):
        if i%2==0:
            print(i,list[i])

    print("最大值",max(list))
    print("最小值",min(list))

    # list的方法
    print("第一个33的位置",list.index(33))
    print("33出现的次数",list.count(33))
    list.append(77) #追加
    list.remove(77) #删除
    list.sort()
    list.sort(reverse=True)
    print(list)