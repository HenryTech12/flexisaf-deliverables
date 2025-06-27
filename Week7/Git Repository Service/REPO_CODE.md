 
#create a repository
git init 
#clone to local machine
git clone <repository url>

#to create a branch
git checkout -b <branch-name>

#to make changes
git add .

#to commit changes made
git commit -m "any commit message"

#to push to repo
git push origin <branch-name>

#to send pull request
gh pr create --base main --head <branch-name> --title "Your Title" --body "PR description" (using GitHub cli)

#to merge pull request
git fetch origin pull/id/head:pr-id
git checkout master
git merge pr-id
git push origin master
