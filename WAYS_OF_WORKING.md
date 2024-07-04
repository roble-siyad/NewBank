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
4. Provide a clear title and description for the PR.
5. Reference any related issues by linking the issue from Trello or GitHub.
6. Request reviews from relevant team members.

## Code Reviews
Code reviews are essential for maintaining code quality and knowledge sharing:
- Be respectful and constructive in your feedback.
- Focus on the code, not the author.
- Look for potential bugs, readability issues, and adherence to coding standards.
- Approve the PR if it meets all requirements or request changes with specific feedback.

## Conclusion
Following these guidelines helps ensure a smooth and productive development process. Thank you for contributing to NewBank and helping us build a better banking solution!