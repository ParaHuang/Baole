
if __name__ == '__main__':
    year = 2015
    month = 7
    date = 3
    # days = 31+28+31+30+31+30
    # days += 3
    days = 0
    daysOfMonth = [0,31,28,31,30,31,30,31,31]
    if year % 400 == 0 or year % 4 == 0 and year % 100 != 0:
        daysOfMonth[2] = 29


    for m in range(1,month):  #0~6
        days += daysOfMonth[m]

    days += date

    print(days)