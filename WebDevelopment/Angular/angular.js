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

Forms:-
Template forms:-
It is the basic form
Template driven forms are form where most of the logic is written in the HTML template.
Angular automatically create the form object.
template driver form use forms module, ng model and ng form.

Reactive Forms:-
Reactive forms are forms where all form controls created inside typescript component.
1) ReactiveFormsModule - Enable reactive form
2) FormGroup - Represent complete form
3) FormControl - Represent each input field
4) Validators.required() - Make field mandatory
5) formBuilder - create reactive form

Form Builder workflow:-
FormBuilder-> Creates FormGroup -> Adds FormControls -> Applies Validators -> connect with html using formGroup and formControlName.

What is Dependency Injection?
-: Dependency Injection is the design pattern in angular where angular automatically create and inject the required dependency.
such as services into component.
It improve the code reusability, reduce coupling, make application easier to maintain and test.

Services and Angular:-
It is a typescript class that contains business logic data or common functionalities that can be shared across multiple components.
Instead of writing the same code in two different components we write it once in a service and reuse it.

Why we use Services?
1) Reuse code across multiple components.
2) Share data between components.
3) Call RestAPI's.
4) Make application easy to test and maintain.

What is @Injectable?
It is a decorator that make a class available for dependency.

What is an Observable?
It is an object provided by RXJS (reactive extension for java script) that emits data over time.
It is used to handle Asynchronous operation(multithreading) such as HTTP requests, user events, and real time updates.

Why we use Observable?
1) Handle Asynchronous data.
2) Make HTTP API calls.
3) Listen user event like click, inputs.
4) Work with timers and intervals.
5) Receive real time update.
example - youtuber new notification after subscribe.
subscribe()- Listen observable and execute code when data is emited.

WHy do we use Subscribe?
- To receive data from API.
- To handle asynchronous operations
- To process resources fro observable
- To handles success eorro and completion event.

syntax- 
observable subscribe((data)=>{
    //handle data
    })

Routing in angular means navigating between diff component in single application without refreshing the page 
We use routing to -
1) Navigate between different component
2) Protect routes using guards.

What is the purpose of <router-outlet> ?
->It is an angular directive that act as a placeholder where the routed component is displayed based on the current URL.
When the router changes, angular loads the curresponding component and render inside the router outlet without refreshing the entire page.


*/