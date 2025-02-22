# MyIA
My IB Internal Assessment written for IB Computer Science SL in my senior year of high school 2024-25

# Title Page
International Baccalaurette - Diploma Programme  
Computer Science SL - Internal Assessment
### Financial Planner and Personal Balance Sheet
Vihaan Kerekatte  
William G. Enloe High School  
2024-2025  
Word Count: 2068

# Criterion A: Planning
## The Scenario
The client is Mr. Kerekatte, my father who is in need of an efficient process to manage his financial statements. Including all assets, liabilities, and day to day business/personal expenses. Many current financial planners are costly and their complex graphical interfaces make it difficult for the everyday person to accurately track their finances. Additionally, he was skeptical about the trustworthiness of preexisting financial services. After consulting with him, I proposed a solution of making a desktop application that stores all of his assets including money in banks, cash, investments, valuables, and big purchases as well as liabilities in order to determine net worth. The application will also include growth projections taking into account salary as well as investment growth projections. There will also be a day-to-day purchases tab to provide a comprehensive report of his total finances.
## Rationale for the Solution
The concept of creating a financial planning system was based on the idea that finances can be stored and updated throughout time, while giving accurate future projections. I decided to use Java to create the solution because I have experience using it and it was/is covered in computer science courses I have taken/am taking. Java will also allow me to create a GUI based system using JSwing to display information in an organized and user friendly manner. This will be a desktop application which makes it ideal for the client to input his information. A mobile application will not be effective due to its incompatibility with Java on a mobile interface.
## Success Criteria
* The client can input specific financial data such as
  * Assets
    * Cash you have in your checking and savings accounts
    * Money you hold in brokerage accounts
    * Retirement accounts, like a 401(k) or individual retirement account (IRA)
    * The value of your house
    * Investment properties
    * The value of your car or other motor vehicles
    * Cash value portion of your whole life insurance plan
    * Valuables and collectibles such as fine art and jewelry
  * Liabilities
    * Mortgage loan
    * Auto loan
    * Student loans
    * Secured and unsecured personal loans
    * Credit cards
    * Unpaid medical bills
    * Unpaid taxes
    * Home equity loan
* The client can easily update this data
* The program can generate a graph for compound interest
* The program can determine net worth, total assets, and total liabilities
* The client can input day-to-day additions/expenses
* The program will allow the client to view data in an organized manner (chart/table)

# Criterion B: Record of Tasks and Design
## Record of Tasks
**Table 1: ROT.**
| Task Number | Planned Action | Planned Outcome | Time Estimate | Target Completion Date | Criterion |
|------------|----------------|----------------|--------------|--------------------|-----------|
| 1 | Research IA topics/examples | Ideas for my IA | 1 hour | 10/3/24 | A |
| 2 | Go through ideas found previously | Finalize idea | 30 mins | 10/9/24 | A |
| 3 | Meet with a client | Figure out if the solution is well designed to solve | 30 mins | 10/11/24 | A |
| 4 | Implement ideas found by meeting with clients in Criterion A | Finalize Criterion A | 1 hour | 10/15/24 | A |
| 5 | Create a timeline for completion of the project | Understand how to manage time effectively | 30 mins | 10/21/24 | B |
| 6 | Create a program overview and research JSwing UI | Finalize UI/user input interface | 2 hours | 10/23/24 | C |
| 7 | Work on Rationale and Success Criteria for Criterion A | Complete entire Criterion A | 1 hour | 11/25/24 | A |
| 8 | Familiarize with basic JSwing GUI concepts (Buttons, panels, drop downs, tables, etc.) | Complete a barebones program incorporating these | 4 hours | 12/26/24 | C |
| 9 | Design the UI interface for the design section of Criterion B | Create pictures of design | 2 hours | 12/27/24 | B |
| 10 | Create flowcharts for user interaction with the interface | Finalize the steps in which the user will input data | 1 hour | 12/29/24 | B |
| 11 | Build off the barebones program and finish the balance sheet tab (create Tablejava) | Completed balance sheet tab | 3 hours | 12/30/24 | C |
| 12 | Do some research about ActionListeners to fix issues with buttons not working | Make all buttons perform their intended task | 2 hours | 1/2/25 | C |
| 13 | Learn about lambda expressions and how they can be used to simplify code | Incorporate lambda expressions into all buttons used for the program | 1 hour | 1/2/25 | C |
| 14 | Work on format for compound interest panel | Complete all text fields, labels, and buttons | 2 hours | 1/3/25 | C |
| 15 | Use compound interest formula (look up) to complete the ActionListener for the Calculate Compound Interest button | Working compound interest calculator | 1 hour | 1/3/25 | C |
| 16 | Add calculate net worth feature to balance sheet tab | Working net worth calculator | 1 hour | 1/4/25 | C |
| 17 | Incorporate pictures and models into the design section of Criterion B | Finish UI Design section of Criterion B | 30 mins | 1/8/25 | B |
| 18 | Finalize the program and fix any issues using a test plan | Complete program | 1 hour | 1/9/25 | B |
| 19 | Meet with the client and show them the program | Obtain client feedback for each success criteria | 2 hours | 1/9/25 | E |
| 20 | Outline Criterion C and find examples of complex code in the program | Take screenshots of code and have an outline of Criterion C | 1 hour | 1/10/25 | C |
| 21 | Incorporate and describe each screenshot/complexity | Analyzed code | 3 hours | 1/10/25 | C |
| 22 | Analyze client feedback | Found areas of improvement and future additions | 2 hours | 1/10/25 | E |
| 23 | Tidy up formatting for each section | Completed IA | 1 hour | 1/12/25 | All |

## Design
### UI Interface
Includes 2 Tabs:
1. Balance Sheet

**Figure 1: Main Tab.**  
[ADD FIGURE]

**Figure 2: “Add Row” button clicked, inserts row in table to input type of “Asset”, “Liability”, “Amount ($)”, and “Date”.**  
[ADD FIGURE]

**Figure 3: “Assets” dropdown menu.**  
[ADD FIGURE]

**Figure 4: “Liabilities” dropdown menu.**  
[ADD FIGURE]  
*Figures 3 & 4 implement scroll panels, the last option not shown is “Other”.

**Figure 5: “Delete Row” button, confirmation, and error message.**
If a row is selected prior to interaction with the “Delete Row” button the message below will display.  
[ADD FIGURE]  
If a row is not selected prior to interaction with the “Delete Row” button the error message below will display.  
[ADD FIGURE]

**Figure 6: “Calculate Net Worth” button.**  
[ADD FIGURE]

2. Compound Interest

**Figure 7: Main Tab with example shown after “Calculate Interest” button has been interacted with.**  
[ADD FIGURE]

### Program Organization UML
Made using http://www.lucidchart.com  
**Figure 8: UML Diagram.**  
[ADD FIGURE]

### Program Flow Flowchart
Balance Sheet Tab:
**Figure 9: Balance sheet tab flowchart.**  
[ADD FIGURE]

Compound Interest Tab:
**Figure 10: Compound interest tab flowchart.**  
[ADD FIGURE]

## Test Plan
**Table 2: Test plan.**
| Test Type | Nature of Test | Example/Outcome |
|-----------|---------------|----------------|
| The user can add and delete rows in the balance sheet table. | Check if add row and delete row buttons work. | If the “Add Row” button is pressed, a row should be added to the table. If the “Delete Row” button is pressed, the selected row should be deleted from the table. |
| The user can input and update data in each column of the table. | Check if each column box is editable. | If the “Asset” or “Liability” box is selected, display a dropdown menu. If the “Amount ($)” box is selected, allow the user to input or update data. If the “Date” box is selected, allow the user to input or update data. |
| The program can generate a graph for compound interest. | Use compound interest formulas to generate a graph using user inputted data. | Display a graph showing the growth of a certain value by compound interest. |
| The program can calculate net worth, total assets, and total liabilities. | Input values and check if calculations occur correctly. | Display the value of all assets, liabilities, and the net worth of the person given user inputted data from the table. |
| The client can input day-to-day additions/expenses. | Check if the day-to-day additions/expenses dropdown option is working. | Display “Day-to-day additions/expenses” as a row in the table. |
| The program will allow the user to view data in an organized manner. | Input values in the balance sheet tab. | Display data in an organized and intuitive table. |

# Criterion C: Development
## Imports and Dependencies
This program uses the CodeHS IDE and does not depend on anything outside of the standard java utility library, the Java Swing GUI library and AWT library - no other libraries or dependencies were imported.
## Techniques Used
A. Classes  
B. Arrays  
C. ArrayLists  
D. Buttons  
E. Event Handlers (Lambda Expressions and ActionListeners)  
F. Error Handling  
G. Confirmation Statements  
H. Nested if statement  
I. GUI  

**A. Classes**  
This program incorporates two main classes and extends a third Abstract class in order to separate responsibilities, making the program easier to read as well as streamlining the logic.
* MyProgram: Contains the main method and the entry point for the application (runner). It creates the GUI and interaction logic for both the balance sheet and the compound interest calculator.
* Table: This custom class extends the Abstract class AbstractTableModel and requires the rewriting of certain methods. It handles the data model for the balance sheet, ensuring smooth integration with JTable. It also includes methods for adding and deleting rows, retrieving column names and data, and setting value constraints. One key method is the isCellEditable method, returning a boolean, and restricting the user to input a row as both an asset and a liability. It uses if statements to check if the user has selected a value from the dropdown defining the row as specifically an asset, and vice versa.
  * All methods in this class are annotated with @Override because the class extends AbstractTableModel and overrides the same defined methods in that parent class.

**Figure 11: isCellEditable method.**  
[ADD FIGURE]

**B. Arrays**  
This program uses arrays to store fixed sets of data for the dropdown options in the GUI. These represent the options that the user has for the type of asset or liability. This is preferred over an ArrayList because it requires a fixed amount of options. Two examples are shown below:
* String[] assetOptions: Contains a String array of asset categories displayed in the “Assets” dropdown menu.
* String[] liabilityOptions: Contains a String array of liability categories displayed in the “Liabilities” dropdown menu.
* Although both variables are of type JComboBox, the String array (in the parenthesis) is passed to the JComboBox constructor.

**Figure 12: assetOptions and liabilityOptions arrays.**  
[ADD FIGURE]

**C. ArrayLists**  
The Table class uses an ArrayList to dynamically manage the amount of rows in the balance sheet tab. Allowing for flexibility in the addition and deletion of rows. Since each row is not a singular type it is considered an array of objects, thus initialized as ArrayList<Object[]>. The use of ArrayList is ideal for this use case as it allows the user to add or delete as many rows as they wish.  
**Figure 13: data ArrayList in Table.java.**  
[ADD FIGURE]  

**D. Buttons and Event Handlers**  
This program uses several JButton components to facilitate user interaction. These are objects inherited from the JSwing library that allow a user to complete a task. Some buttons used are:
* Add Row Button: Adds a blank row to the balance sheet.
* Delete Row Button: Removes the selected row after user confirmation.
* Calculate Net Worth Button: Computes and displays the total assets, liabilities, and net worth based on the table data.
* Calculate Interest Button: Computes the compound interest using the universal formula based on user inputs into the JTextFields.  

Each button is associated with an ActionListener, implemented using a lambda expression for concise and readable code. These ActionListeners continuously “listen” for a user interaction to perform the task necessary. For example, the code for the ActionListener of the calculateNetWorthButton is shown below:  
**Figure 14: calculateNetWorthButton ActionListener, with lambda expression.**  
[ADD FIGURE]  
* Lambda expression is denoted with the “->” symbol and works similarly to a method.
* This snippet of code also uses an algorithm to compute the total net worth.
  1. It uses a for loop to parse through each row inputted.
  2. Uses nested if statements to check if the row is defined as an asset or liability.
  3. Adds to the double totalAssets variable if an asset.
  4. Adds to the double totalLiabilities variable if a liability.
  5. Calculates net worth but subtracting totalLiabilities from totalAssets.
  6. Prints out the total net worth, total assets, and total liabilities.  

**E. Error Handling and Confirmation Statements**  
This program implements error handling techniques to ensure that it runs reliably without giving any runtime errors. One example of this is in preventing invalid calculations in the compound interest tab by checking if all user inputs are correctly inputted as double values. If this is the case the program will continue with the calculation, otherwise it will warn the user that there is incorrect inputs:  
**Figure 15: calculateInterestButton ActionListener and error message.**  
[ADD FIGURE]  

**F. Confirmation Statements**  
This program also implements confirmation messages to improve user experience and prevent the user from deleting a row of data by mistake. After the Delete Row Button is selected and if a row has also been selected the program will present the user with a popup confirming that they would like to delete the row. If there is no row selected prior to interaction with the button it will resort to error handling and display an error message:  
**Figure 16: deleteRowButton ActionListener and error/confirmation message.**  
[ADD FIGURE]  

**G. Nested if Statement**  
Nested if statements are used in this program to enforce logical constraints to establish a certain task. For example, in the Table class the icCellEditable method ensures that either the “Assets” or “Liabilities” column is editable, but not both:  
**Figure 17: isCellEditable method in Table.java.**
[ADD FIGURE]  

**H. GUI**  
The GUI is designed using Java Swing components and adheres to a tab-based structure. It makes the user experience more intuitive and user-friendly. Key features of the GUI include:
* Tabbed Layout: Separates functionalities into two tabs.
* Interactive Table: Allows dynamic data entry and modification with dropdowns, scroll wheels, and editable cells.
* Error Handling: Provides user feedback via popups for invalid inputs or actions, such as attempting to delete a row when none are selected.  
The figure below shows the initialization of the entire frame, balance sheet tab, and table.

**Figure 18: Initialization of frame.**  
[ADD FIGURE]  
The figure below shows the addition of all buttons and fields in the compound interest tab to the tab itself. Finally the runner file ends with the statement frame.setVisible(true) allowing the user to see all JObjects added to the frame.  
**Figure 19: Addition of all buttons to panel and frame visibility.**
[ADD FIGURE]

## Works Cited
* Java Code Junkie (no date) JButton | Java Swing Tutorial for Beginners, YouTube. Available at: https://www.youtube.com/watch?v=QvFQFmzRqoo [Accessed: 26 December 2024].
* Nagesh, N. (Arjun) (2024) Lambdas in event-driven programming, Medium. Available at: https://medium.com/@nagarjun_nagesh/lambdas-in-event-driven-programming-fd448541991e#:~:text=The%20lambda%20expression%20%60e%20%2D%3E,is%20printed%20to%20the%20console [Accessed: 2 January 2025].
* Package java.awt (2024) java.awt (Java Platform SE 8 ). Available at: https://docs.oracle.com/javase/8/docs/api/java/awt/package-summary.html [Accessed: 23 October 2024].
* Package javax.swing (2024) javax.swing (Java Platform SE 8 ). Available at: https://docs.oracle.com/javase/8/docs/api/javax/swing/package-summary.html [Accessed: 23 October 2024].

# Criterion E: Evaluation
## Success Criteria and Client Feedback
**Table 3: Success criteria and client feedback.**
| Success Criteria | Fulfilled? | Client Feedback |
|------------------|-----------|----------------|
| The client can input specific financial data. | Met | “I am able to input any numerical value and also organize by date. However, the interface can glitch at times or make it confusing which box I have currently selected.” |
| The client can easily update this data. | Met | “All buttons work and accurately complete their tasks.” |
| The program can generate a graph for compound interest. | Partially met (cannot display graphs but can display the value after a certain amount of time). | “The graphs were not generated but I was impressed by the accuracy and speed of the calculation.” |
| The program can determine net worth, total assets, and total liabilities. | Met | “I was able to see those values. However, the placement on the screen was slightly confusing.” |
| The client can input day-to-day additions/expenses. | Met | “This is one option on the dropdown menu.” |
| The program will allow the client to view data in an organized manner (chart/table). | Met | “Organization is very intuitive… I liked that everything was very neat and simplistic.” |

## Future Improvements
1. Minor Improvements  
  a. Add a separate tab for day-to-day expenses to increase organization and user experience.  
  b. Increase readability and organization of code with the usage of more classes and less in the main file.  
  c. Fix the position of the net worth, total assets, and total liabilities display. Currently, the position is awkward in relation to the other buttons for “Add Row” and “Delete Row.”  
  d. Set up error handling for the balance sheet table as well. The program currently gives a runtime error when the “Calculate Net Worth” button is pressed and incorrect values are inputted into the “Amount ($)” column.  
2. Major Improvements  
  a. Fix the balance sheet to look more like an actual balance sheet. This would expand the market for this application to businesses.  
  b. Add other types of interests, for example, simple interest and accrued interest.  
  c. Create projections for money growth using the different types of interest. This would completely satisfy the one success criterion that was not met.  
  d. Create a sign in tab and accounts for privacy and data protection.  
  e. Connect with a local database to store data for multiple logins.  
