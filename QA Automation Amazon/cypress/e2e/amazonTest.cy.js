///<reference types = "cypress" />


describe('Amazon Login and Product add to cart', () => {
  it('should open Amazon website', () => {
    cy.visit('https://www.amazon.in/')
    cy.get("#nav-link-accountList").click();
    cy.get('#ap_email').type('thenexus6969@gmail.com')
    cy.get('#continue').click()
    cy.get('#ap_password').type('Hala007@')
    cy.get('#signInSubmit').click()
    cy.get('#nav-link-accountList-nav-line-1').should('contain', 'Hello, Shivam')
    cy.get('#twotabsearchtextbox').type('Realme Phone')
    cy.get('#nav-search-submit-button').click();
    cy.get('[data-image-index="1"]').click() 
    cy.window()
    cy.get('#buy-now-button').click()
    // cy.window().then((win) => {
    //   // Switch to the new tab
    //   win.focus()
    //   // Verify the content on the new tab
    //   cy.title().should('contain', 'Google')
    // })
  
  })


})
