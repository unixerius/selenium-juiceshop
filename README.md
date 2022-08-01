## Attribution

This project is a fork of Mohammad Faisal Khatri's proof-of-concept of using Selenium 4 for functional testing.

The original project includes automated testing of a number of demo web applications. It's excellent work! We would like to thank Mohammad for his continued efforts in teaching people about automated testing. 

- Twitter: [mfaisal_khatri][twitter]
- LinkedIn: [Mohammad Faisal Khatri][linkedin]
- Website: [mfaisalkhatri.github.io][website]

[linkedin]: https://www.linkedin.com/in/faisalkhatri/
[twitter]: https://twitter.com/mfaisal_khatri
[website]: https://mfaisalkhatri.github.io


## What is this project?

The original project runs automated web UI tests against a few target systems. 

This fork of the project has been stripped of everything, **except** for the Selenium Grid-based tests of [Juice Shop](https://github.com/juice-shop/juice-shop).

The automated tests in this project are used to demonstrate the concepts of unattended, scripted testing of web applications. As part of a five-day course on DevSecOps basics, students are introduced to a large number of concepts bringing them up to an A1 / Awareness level of experience with various DevSecOps tools. 

Mohammad provides two excellent write-ups on how these tests work:

- [End to end testing using Selenium WebDriver and Java](https://medium.com/@iamfaisalkhatri/end-to-end-testing-using-selenium-webdriver-and-java-4ff8667716ca)
- [Parallel execution of tests using Selenium Grid 4 with Docker Compose](https://medium.com/@iamfaisalkhatri/parallel-execution-of-tests-using-selenium-grid-4-with-docker-compose-2dc243f4fe8b)


## Starting a test

The included Docker Compose file starts containers for Selenium Grid, including three different browser nodes. It also starts a local Docker container which runs Juice Shop.

The target URL of the test suite defaults to "http://juice-shop:3000/#". This is configured in `JuiceShopTests.java`. 

If you would like to test against a different target, you can disable the Juice Shop container in Docker Compose and you can provide a different URL in the Java code. For example, in our class we will use a target URL like "https://unixerius-juice1.azurewebsites.net".

Running the test suite can be done by running:

* `docker-compose -f docker-compose-v3.yml up`
* `mvn test`

You can see the test jobs getting queued for the three browsers, by visiting the Selenium Grid UI at http://localhost:4444. 

Once the jobs run, you can click on the camera of a running session, to see what the browser is doing. 


## End to End Tests for OWASP Juice Shop

1. User will navigate to the website and close all the pop up first.
2. User will click on Login link and click on `Not yet a customer link` and register himself on the website.
3. Once the Registration is successful, User will Login with that username and password.
4. After successful Login, User will Add AppleJuice and BananaJuice to the Basket.
5. After asserting the messages for items added to basket, user will check for the count of items displayed on top
   of `Your Basket` link.
6. User will click on `Your Basket` link and check the order details and click on Checkout.
7. User will enter a new Address for Delivery and select it to process further.
8. User will continue further to Card for Payment and select the card added to make payment.
9. On the Order Summary page, user will verify all the details like Name, Address, Order details and total amount to be
   paid and place order.
10. User will re-check the details on Order confirmation page and check for `Thank You` message order confirmation and
    delivery message.
