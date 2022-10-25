s=set(input("enter any word"))
v='aeiouAEIOU'
c=0
for i in s:
	if i in v:
		c=c+1
if c>=5:
	print("Sentence has vowels")
else:
	print("senctence doesn't contain all vowels ")
