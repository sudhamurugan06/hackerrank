# Strings: https://www.hackerrank.com/challenges/swap-case
def swap_case(s):
    final_str=final_str=str()
    for i in range(len(s)):
        if s[i].isupper()==True:
            final_str=final_str + s[i].lower()
            
        elif s[i].islower()==True:
           final_str=final_str +s[i].upper()
            
        else:
            final_str=final_str+s[i]
    return final_str

if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)
    