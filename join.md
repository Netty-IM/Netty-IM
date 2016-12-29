# how to join in development of *Netty-IM*

## Keep track with *Netty-IM* group

### Fork *Netty-IM/Netty-IM* project into your own repository

1. Sign up and sign into *https://gitlab.com*
2. Visit *https://gitlab.com/Netty-IM/Netty-IM*
3. Click the *Fork* button and fork this project into your repository

## Clone *your-repository/Netty-IM* project locally

1. Install [git](https://git-scm.com/) 
2. Run *git clone git@gitlab.com/your-repository/Netty-IM.git*
3. (Optionally) run *git config --global user.name "your name"*
3. (Optionally) run *git config --global user.email "your@email.com"*

## Add *Netty-IM* as an upstream

1. In your local project directory, run *git remote add netty-im git@gitlab.com/Netty-IM/Netty-IM.git*
2. Run *git fetch netty-im master*

## Change and commit your changes

1. Edit whatever you want
2. Commit your changes (using *git add* and *git commit*)

## Sync with upstream changes and upload

1. Run *git fetch netty-im master*
2. Check into your own master branch by *git checkout master*
3. Run *git merge netty-im/master* or *git rebase netty-im/master* if you know what you are doing
4. Push your changes to remote repository by *git push*

You can execute *git-merge.sh* instead of three commands. 

## Commit your changes to *Netty-IM*

1. Visit *https://gitlab.com/your-repository/Netty-IM*
2. Click *+* button and then click *New Merge me.imyun.request.Request* menu item
3. Select your *Master* as the source branch
4. Select *Netty-IM/Netty-IM* as the target branch
5. Click *Compare branches and continue* button
6. Click *Ok* button
7. Wait the approval of your merge request

