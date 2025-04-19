# Coding Style Guide
1. All methods will have brackets, even if the body is a single line. Additionally, brackets must be placed on their own lines. 
	- Ex.
      ```
      methodName()
      {
        // code here
      }
      ```
3. Method bodies will not exceed 60 lines, and each line should not be longer than 132 characters. If the method body exceeds 60 lines, consider making it another method.
4. Variable names will be meaningful and relate to their purpose.
	- One-character variable names will be avoided.
	- Variable names will follow camel-casing.
		- Ex. methodName()
5. Public and protected methods will use Javadoc and follow the Javadoc standards.
	- Private methods will use regular commenting.
	- Additional comments will be written above any complicated or unclear code blocks.
6. Indentation will be 4 spaces.
7. There will be whitespace between methods and large code blocks. Whitespace will not exceed over 2 lines.
	- Ex.
      ```
      methodName()
      {
         // code 1 here
        
         // code 2 here
      }
      ```
