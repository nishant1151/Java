dict={'name':['a','b'],'sports':['c','d']}

#       name    sports
# 1     a       c
# 2     b       f



for i in dict:
    print("   "+i,end=" ") 
for i in dict:
    for j in range(0,2):
        print(f'\n{j}  {dict[i][j]}',end=" ")
   