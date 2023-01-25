nums = [1,2,2,3,4,6]
def get_missing_no(nums):
    map = {}
    a = 0
    curr_sum = 0
    n = max(nums)
    for i in nums:
        curr_sum = curr_sum+i
        map[i] = map.get(i,0)+1
    for key,value in map.items():
        if value !=1:
            a = key
    sum = (n*(n+1))/2
    ans = abs(sum-curr_sum)
    return ans
ans = get_missing_no(nums)
print(ans)