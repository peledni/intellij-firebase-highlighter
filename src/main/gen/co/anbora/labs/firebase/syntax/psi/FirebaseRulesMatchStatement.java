// This is a generated file. Not intended for manual editing.
package co.anbora.labs.firebase.syntax.psi;

import com.intellij.psi.PsiElement;
import java.util.List;
import org.jetbrains.annotations.*;

public interface FirebaseRulesMatchStatement extends PsiElement {

  @NotNull List<FirebaseRulesAllowStatement> getAllowStatementList();

  @NotNull FirebaseRulesFullPathStatement getFullPathStatement();

  @NotNull List<FirebaseRulesFunctionStatement> getFunctionStatementList();

  @NotNull List<FirebaseRulesMatchStatement> getMatchStatementList();
}
