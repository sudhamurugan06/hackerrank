#Question Link: https://www.hackerrank.com/challenges/python-lists
if __name__ == '__main__':
    N = int(input())
    list_initial=[]
    for i in range (N):
        l_value=input().split(' ')
        list_initial.append(l_value)
    list_final=[]
    for i in range (N):
        if list_initial[i][0]=="insert":
            index=int(list_initial[i][1])
            list_final.insert(index, int(list_initial[i][2]))
        elif list_initial[i][0]=="print":
            print(list_final)
        elif list_initial[i][0]=="remove":
            list_final.remove(int(list_initial[i][1]))
            
        elif list_initial[i][0]=="append":
            list_final.append(int(list_initial[i][1]))
        elif list_initial[i][0]=="sort":
            list_final.sort()
        elif list_initial[i][0]=="pop":
            list_final.pop()
        elif list_initial[i][0]=="reverse":
            list_final.reverse()
        