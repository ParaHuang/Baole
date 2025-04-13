import math


# no return, no arguments
def printHelloFor5Times():
    for i in range(5):
        print("hello")
# no return, with arguments
def printHelloForNTimes(n):
    for i in range(n):
        print("hello",i)

# with return
def add(a,b):
    return a+b

if __name__ == '__main__':
    # printHelloFor5Times()
    printHelloForNTimes(6)  #6
    print()
    printHelloForNTimes(8)  #8

    c = add(10,20)
    # if c%2==0:

    num = input("enter an integer:")
    #result = isPrime(num)


    '''
    for(int i=1 ; i<=5 ; i++) {
			if(i==3) {
//				continue;		//skip the current time of the loop ,directly continue the next time
				break;			//end the loop
//				return;			//end the program
			}
			System.out.println(i);
		}
		System.out.println("the end");
    '''