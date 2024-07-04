# Ways of Working for Developers

This document outlines the best practices and guidelines for developers contributing to the NewBank project. Adhering to these practices ensures a consistent and efficient workflow, fostering collaboration and maintaining code quality.

## Table of Contents
- [Code Style](#code-style)
- [Branching Strategy](#branching-strategy)
- [Commit Messages](#commit-messages)
- [Pull Requests](#pull-requests)
- [Code Reviews](#code-reviews)
- [Testing](#testing)
- [Documentation](#documentation)
- [Communication](#communication)
- [Issue Tracking](#issue-tracking)

## Code Style
Maintaining a consistent code style is crucial for readability and maintainability. Please adhere to the following guidelines:
- Follow the Java Code Conventions.
- Use meaningful variable and method names.
- Keep methods and classes short and focused.
- Document public methods and classes with Javadoc comments.
- Format code consistently. We recommend using an IDE with built-in code formatting (e.g., IntelliJ IDEA, Eclipse).

## Branching Strategy
We use a feature branch workflow to manage development:
- **main**: The main branch contains the stable codebase. Only merged, reviewed, and tested code should be in this branch.
- **dev**: This is the development branch which development branches will branch from. We merge code here which has been code reviewed by peers.
- **feature branches**: Create a new branch from the dev branch, for each feature or bugfix. Name the branch descriptively, e.g., `feature/user-authentication` or `bugfix/transaction-error`.

### Creating a Feature or Bug Branch
First make sure you have the latest code from the main branch. You can do this using git pull:
```bash
git checkout main
git pull
```

Then switch to the dev branch and pull from here incase any changes have been merged into dev:
```bash
git checkout dev
git pull
```

From here you can create the feature (or bug, just replace 'feature' with 'bug')  branch:
```bash
git branch feature/your-feature-name
```

Then switch to the newly created feature branch:
```bash
git checkout feature/your-feature-name
```

Or you can do both with this neat one-liner:
```bash
git checkout -b feature/your-feature-name
```

## Adding files to a commit
When you have made changes to files in the repository, you must add the files you want to include in the commit before you push to your branch.

You can choose specific files to add by using git add:
```bash
git add README.md
```
Or if you are confident in the changes you have made, you can add all changed files like so:
```bash
git add .
```

## Commit Messages
Write clear and concise commit messages to explain what and why changes were made:
- Use the present tense ("Add feature" not "Added feature").
- Keep the first line short (50 characters or less) and add a detailed description if necessary.
- Reference relevant issues or pull requests.

### Commit message conventions
When creating a commit message, there is a popular convention within the development community:
- **feat**: This is for any new features added to the code.
- **fix**: Fix is used when correcting any bugs.
- **docs**: Any changes to documentation is through docs.
- **style**: Changes that do not affect the meaning of the code (white-space, formatting)
- **test**: Adding test files for src code.

### Example Commit Message
- feat(users): Add user feature
- feat(loaning): Add loaning system
- style(spacing): Add white space between methods
- test(user accounts): Include unit tests for user accounts

## Pull Requests
Even if you are making a small change, you should create a pull request (PR) to merge your changes into the main branch:

- **Code Review**: PRs facilitate code review by other team members.
- **Collaboration**: PRs make it easy for other contributors to see proposed changes and provide feedback.
- **History and Documentation**: PRs serve as a record of changes and their rationale.
- **Approval Process**: PRs require approval from team members, adding a layer of quality control.

### Creating a Pull Request
1. Ensure your branch is up to date with the main branch.
2. Push your branch to GitHub:
    ```bash
    git push origin feature/your-feature-name
    ```
3. Go to the repository on GitHub and click "Compare & pull request".
4. On the right, you should see a panel, within which you can assign yourself to the PR.
5. You can also add a suitable tag to the PR - is the PR you are working on for an enhancement (a new feature), a bug (code is not working) and so on.
6. Provide a clear title for the PR - This can be based of the ticket for the PR from Trello!
7. The description for the PR must be in this format for every PR.

    - Line 1: Link to the ticket from Trello - You can find the link by clicking on the ticket and copying from the URL.
    - Add a space between the next line.
    - Line 3: Add a couple sentences describing why this PR is being raised.
    - Add a space between the next line.
    - Line 5: A sentence on what this PR is tackling.

    Format for PR description:
    ```
    https://trello.com/example-ticket-link

    When a new repository is created, it is a good idea to get contributing developers up to speed with the teams ways of working!

    This PR is focused on adding the WAYS_OF_WORKING.md to the repository to outline coding conventions.
    ```

8. DO NOT CLICK CREATE PR - instead click the drop down arrow and select `Draft a PR`, this can be converted to a formal PR later :wink:
9. From here on you can work on your code and any committed changes will appear in the PR.
10. When you confident you have address everything regarding the ticket in your code, you can convert the PR by clicking `Ready for review`.
11. Remember to select some reviewers to look over the changes you have made - They will have a fresh pair of eyes and will comment if they see any errors :neckbeard:
12. Once all comments from reviewers have been addressed - DO NOT CLICK MERGE PULL REQUEST!!! - Instead click `Squash and Merge`, this squashes the several commits you may have made into a single commit (Uses the PR title - so will follow the implemented feature or bug fix), which is way better for commit history.
13. If it is successful, you should see your changes in the main branch - Well done! You have just merged your first bit of code :relieved:.

## Code Reviews
Code reviews are essential for maintaining code quality and knowledge sharing:
- Be respectful and constructive in your feedback.
- Focus on the code, not the author.
- Look for potential bugs, readability issues, and adherence to coding standards.
- Approve the PR if it meets all requirements or request changes with specific feedback.

### How to leave a Code Review
When a fellow developer assigns you to a code review, you will receive a notification. Follow it to the PR and from here you can click the add a review.

1. Read over the code submitted, have a look at files and make sure everything is as it should be.
2. If you notice any mistakes, you can add a comment using the `+` symbol. Make sure the comment is clear and establishes were there can be improvement.
3. Once you are confident in your review, you can either select approve review in the top right, or ask for changes with your comments submitted.
4. The developer who owns the PR should make the changes if they feel they are relevant and commit the changes.
5. From here they can request a re-review from developers who left comments.
6. Once all changes have been addressed, you can select `squash and merge`.

## Conclusion
Following these guidelines helps ensure a smooth and productive development process. Thank you for contributing to NewBank and helping us build a better banking solution!