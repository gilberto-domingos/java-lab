
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccessedComponent } from './components/accessed/accessed.component';

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'accessed' },

  { path: 'accessed', component: AccessedComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
