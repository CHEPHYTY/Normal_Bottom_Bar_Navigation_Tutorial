
https://github.com/CHEPHYTY/Normal_Bottom_Bar_Navigation_Tutorial/assets/101518415/66b9b77d-5756-4bcf-9616-ae599667a6cf
# Android Navigation App Tutorial

## Navigation App

> OBJECTIVE: This is a Short Tutorial for Using Normal Bottom_Navigation to navigate from one activity to another.

[![image](https://github.com/CHEPHYTY/Normal_Bottom_Bar_Navigation_Tutorial/assets/101518415/4796a6b4-34fd-45ed-8797-c97e36b2930e)](https://youtube.com/shorts/mMA03EUpZsg?feature=share)

> [To Watch the video click on the picture](https://youtube.com/shorts/mMA03EUpZsg?feature=share)
>
> # Let's Start the Tutorial.

### There are a Few Steps to Get the Navigation Responsive

### In this App we used 5 Fragment Activities to navigate

- STEP 1: Add all the Resource files to the drawable file and add all the extra colors and strings want to use to the respective resource file.
- STEP 2: Create a FrameLayout and BottomNavigation in MainActivity.xml and give it an ID.
- STEP 3: Create a Menu file for Icons and Respective name display.
- STEP 4: For Fragment Display create separate Fragments to show data properly.
- STEP 5: Write Code to Sync the Icon With the actual Navigation.

---

### STEP 1:

Add all the Resource files to the drawable file and add all the extra colors and strings want to use to the respective resource file.

- Image Resource

![image](https://github.com/CHEPHYTY/Normal_Bottom_Bar_Navigation_Tutorial/assets/101518415/bdadfe86-5926-4aec-b16c-c2ae16d38996)

- Color Resource

![image](https://github.com/CHEPHYTY/Normal_Bottom_Bar_Navigation_Tutorial/assets/101518415/fae63d93-e1ea-4c74-a8a1-b32810c258e9)

---

### STEP 2:

Create a FrameLayout and BottomNavigation in MainActivity.xml and give it an ID.

![image](https://github.com/CHEPHYTY/Normal_Bottom_Bar_Navigation_Tutorial/assets/101518415/4e16cdcb-e823-4ea6-b984-030aacc39927)
### STEP 3:

Create a Menu file for Icons and Respective name display.

TO DO so got to res_Folder >> Right Click >> New >> Android Resource Directory 
And then a dash Board Open choose Value as __menu__ and name the directory as __menu__



https://github.com/CHEPHYTY/Normal_Bottom_Bar_Navigation_Tutorial/assets/101518415/2eb7c873-3f16-4489-a953-5f51c3b017e2


Create a Bottom_menu.xml to store for navigating the location.

![image](https://github.com/CHEPHYTY/Normal_Bottom_Bar_Navigation_Tutorial/assets/101518415/b342adae-75e8-4161-96cc-7cb3de5b7586)

And then add the Required elements.

![image](https://github.com/CHEPHYTY/Normal_Bottom_Bar_Navigation_Tutorial/assets/101518415/7dcd39a9-77e8-477c-82bb-5aa7ce395759)
### STEP 4:

For Fragment Display create separate Fragments to show data properly.

To do so Go to folder >> Right click >> New >> Fragment >> BlankFragment


https://github.com/CHEPHYTY/Normal_Bottom_Bar_Navigation_Tutorial/assets/101518415/0a5e7d75-f0d0-4548-bd74-80780059e097


Name the fragment and Continue the process for 4 More times and Create 5 Fragments Named as

 - __HomeFragment__
 - __ShortsFragment__
 - __AddFragmetn__
 - __SubscriptionFragment__
 - __LibraryFragment__

 and Edit a Bit to Know how the Screen would be known.

 ![image](https://github.com/CHEPHYTY/Normal_Bottom_Bar_Navigation_Tutorial/assets/101518415/b258d808-876d-463b-a3f7-7771d9d9ff77)
### STEP 5:

Write Code to Sync the Icon With the actual Navigation.

Create a Function inflateFragment and pass Fragment as Formal Argument.
### Code :

'''kotlin

    private fun inflateFragment(newInstance:Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout, newInstance)
        transaction.commit()
    }


'''



write this code to the onCreate Methode..😁😁😁

''' Kotlin


        val Navigation = findViewById<BottomNavigationView>(R.id.Navigation)
        
        Navigation.setOnItemSelectedListener { menuItem ->
            if (menuItem.itemId == R.id.Home)
            {
                inflateFragment(HomeFragment.newInstance())
            }
            else if(menuItem.itemId == R.id.Shorts){
                inflateFragment(ShortsFragment.newInstance())
            }
            else if(menuItem.itemId == R.id.Add){
                inflateFragment(AddFragment.newInstance())

            }
            else if(menuItem.itemId == R.id.Subscription){
                inflateFragment(SubscriptionFragment.newInstance())
            }
            else if(menuItem.itemId == R.id.library){
                inflateFragment(LibraryFragment.newInstance())

            }
                true
        }

'''

Good bye See YOU Soon 🤗🤗🤗🤗🤗🤗

