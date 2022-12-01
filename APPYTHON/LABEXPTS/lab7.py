import numpy as np
row,col=list(map(int,input('Enter row and col').split()))
A=np.array(list(map(int,input('Enter matrix A').split())))
A.shape=(int(row),int(col))
print(A)
if(row==col):
 print(np.linalg.eig(A))
 print(np.linalg.eigvals(A))
else:
 print("eigen values and eigen vectors are not found")