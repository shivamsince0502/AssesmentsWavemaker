///<reference types = "cypress" />


describe('Amazon Login and Product add to cart', () => {


  beforeEach(()=>{
    cy.visit('https://www.amazon.in/');
    cy.get("#nav-link-accountList").click();
    cy.get('#ap_email').type(email)
    cy.get('#continue').click()
    cy.get('#ap_password').type(pass)
    cy.get('#signInSubmit').click()
  })

  it('should be at amazon website', ()=>{
    cy.url().should('contain', 'amazon.in');
  })

  it('Account logged in', ()=>{
    
    cy.get('#nav-link-accountList-nav-line-1').should('contain', 'Hello, Shivam')
  })

  it('Searching for the item', ()=>{
    cy.get('#twotabsearchtextbox').type('Realme Phone')
    cy.get('#nav-search-submit-button').click();
    cy.get('.rush-component > .a-row').click();
  })

  it('Buying for the selected product', () => {
    cy.get('#twotabsearchtextbox').type('Realme Phone')
    cy.get('#nav-search-submit-button').click();
    cy.get('.rush-component > .a-row').click();
    cy.get('#buy-now-button').click();
  })

  it('chekcout', ()=>{
    cy.get('#twotabsearchtextbox').type('Realme Phone')
    cy.get('#nav-search-submit-button').click();
    cy.get('.rush-component > .a-row').click();
    cy.get('#buy-now-button').click();
    cy.url().should('contain', 'payselect');
  })


})



















































