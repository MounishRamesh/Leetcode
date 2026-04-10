class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        arr = [0]*len(nums)
        
        pre = nums[0]
        arr[0] = nums[0]
        for i in range(1,len(nums)):
            arr[i] = pre
            pre *= nums[i]
        print(arr)
        prev1 = nums[len(nums)-1]
        for i in range(len(nums)-2,0,-1):
            print(arr[i]," ",prev1)
            arr[i] = prev1*arr[i]
            prev1 *= nums[i]
        pro2 = 1
        for i in range(1,len(nums)):
            pro2 *= nums[i]
        arr[0] = pro2
        return arr 


        