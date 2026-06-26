/*

For angular we need node , in node we have packeges that can install angular using CLI (commnad line interface)
Angular :
it is typescript based frontend framework used to create single page application SPA,
where as angularJs is an opensource java script frontend framework developed by google for building the dynamic singlepage application dynamic SPA,
AngularJs follow MVC(Model, View, Controlller) architecture where as angular follows Component based architecture.

SPA :
spa loads HTML page and update the content dynamically without refreshing the entire page.
example:- Gmail account, Google Map, Facebook ect.
 
Angular Architecture:
Modules --> Components --> Templates --> Metadata --> Data Binding --> Directives --> Services --> Dependency Injection.


Why we are using typescript in angular ?
- TypeScript is a superset of the javascript and it provides the features static type, classes, interfaces and better tooling 
and because of this we can create maintain and develope angular application easily.


Angular Features :-
1) Component based architecture
2) Two way data binding
3) Forms
4) RestAPI integration

Advantages of Angular :-
1) Fast development 
2) High performace
3) reusable components 
4) Large community support

Binding:- 
Binding is the process of connecting the component(TypeScript) and the view(html).
It allows data flow between application logic and user interface.
It is a mechanism of synchronise data between Angular component and the template that is TypeScript to HTML.
it is used to build communication between html and ts.

1) One way binding:-
there are four types of one way binding

-Interpolation binding : syntax: {{variableName}}
it is used to display data form component to the HTML (TypeScript -> HTML)

-Property Binding : Syntax: [property]="value"
It is used to set the value of HTML elements property from the components.
TypeScript to HTML
Example- it is used to display image , profile picture, unable disable button

-Event binding: Syntax : (event)="method"
it is used to call typescript method when user permits an action.
Generates clickable event
HTML event -> typescript

2) Two way binding:-
it is used to change value into the input box
It is used to create form
syntax: [(ngModel)]="variableName"
[()] it is called banana in box syntax
ngModel is an angular directive used for 2-way data binding between form control and component variable.

 Template : 
 template is a HTML file that defines the UI of components 
 there are two types of templates 
 1) External template (templateUrl)
 - HTMl is written in separete .html file.
 - HTML, typescript and css are separated used in real time project.
 
 2) Inline template (template)
 - HTML is written directly inside components using template property.
 - HTML is inside typescript file, if we want to add css then we have to use styles property directly inside component.




What is Component?
- It is a basic building block of angular application, It controls the specific part of the UI. It provides the metadata(information).
- Component is a TypeScript class, It is decorated with @Component which control the part of UI's by combining HTML, CSS and TypeScript.
- We are using component to divide application into the smaller reusable parts.

How to create Component?
- ng g c componentName
- ng generate component componentName
*/