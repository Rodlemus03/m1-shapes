package jetbrains.mps.samples.Shapes.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import java.awt.Graphics;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.language.SProperty;

public final class Square__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x16bafbb4c6cd4cc5L, 0x83327c6de8729b3fL, 0x51dcaa29974fc1a2L, "jetbrains.mps.samples.Shapes.structure.Square");

  public static final SMethod<Void> drawShape_idW6XMzE_hbz = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("drawShape").modifiers(8, AccessPrivileges.PUBLIC).concept(CONCEPT).baseMethodId(1082824515535573731L).languageId(0x83327c6de8729b3fL, 0x16bafbb4c6cd4cc5L).build2(SMethodBuilder.createJavaParameter(Graphics.class, ""));
  public static final SMethod<Void> drawShapeAt_id3u6SZi0POQS = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("drawShapeAt").modifiers(8, AccessPrivileges.PUBLIC).concept(CONCEPT).baseMethodId(4001135958238383544L).languageId(0x83327c6de8729b3fL, 0x16bafbb4c6cd4cc5L).build2(SMethodBuilder.createJavaParameter(Graphics.class, ""), SMethodBuilder.createJavaParameter(Integer.TYPE, ""), SMethodBuilder.createJavaParameter(Integer.TYPE, ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(drawShape_idW6XMzE_hbz, drawShapeAt_id3u6SZi0POQS);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static void drawShape_idW6XMzE_hbz(@NotNull SNode __thisNode__, Graphics graphics) {
    Shape__BehaviorDescriptor.drawShape_idW6XMzE_hbz.invokeSuper(__thisNode__, CONCEPTS.Square$jR, graphics);
    graphics.drawRect(SPropertyOperations.getInteger(__thisNode__, PROPS.upperLeftX$wAp9), SPropertyOperations.getInteger(__thisNode__, PROPS.upperLeftY$wARb), SPropertyOperations.getInteger(__thisNode__, PROPS.size$wB$e), SPropertyOperations.getInteger(__thisNode__, PROPS.size$wB$e));
  }
  /*package*/ static void drawShapeAt_id3u6SZi0POQS(@NotNull SNode __thisNode__, Graphics graphics, int x, int y) {
    Shape__BehaviorDescriptor.drawShapeAt_id3u6SZi0POQS.invokeSuper(__thisNode__, CONCEPTS.Square$jR, graphics, ((int) x), ((int) y));
    graphics.drawRect(x, y, SPropertyOperations.getInteger(__thisNode__, PROPS.size$wB$e), SPropertyOperations.getInteger(__thisNode__, PROPS.size$wB$e));
  }

  /*package*/ Square__BehaviorDescriptor() {
  }

  @Override
  protected void initNode(@NotNull SNode node, @NotNull SConstructor constructor, @Nullable Object[] parameters) {
    ___init___(node);
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SNode node, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      case 0:
        drawShape_idW6XMzE_hbz(node, (Graphics) parameters[0]);
        return null;
      case 1:
        drawShapeAt_id3u6SZi0POQS(node, (Graphics) parameters[0], ((int) (Integer) parameters[1]), ((int) (Integer) parameters[2]));
        return null;
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SAbstractConcept concept, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @NotNull
  @Override
  public List<SMethod<?>> getDeclaredMethods() {
    return BH_METHODS;
  }

  @NotNull
  @Override
  public SAbstractConcept getConcept() {
    return CONCEPT;
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept Square$jR = MetaAdapterFactory.getConcept(0x16bafbb4c6cd4cc5L, 0x83327c6de8729b3fL, 0x51dcaa29974fc1a2L, "jetbrains.mps.samples.Shapes.structure.Square");
  }

  private static final class PROPS {
    /*package*/ static final SProperty upperLeftX$wAp9 = MetaAdapterFactory.getProperty(0x16bafbb4c6cd4cc5L, 0x83327c6de8729b3fL, 0x51dcaa29974fc1a2L, 0x51dcaa29974fc1a3L, "upperLeftX");
    /*package*/ static final SProperty upperLeftY$wARb = MetaAdapterFactory.getProperty(0x16bafbb4c6cd4cc5L, 0x83327c6de8729b3fL, 0x51dcaa29974fc1a2L, 0x51dcaa29974fc1a5L, "upperLeftY");
    /*package*/ static final SProperty size$wB$e = MetaAdapterFactory.getProperty(0x16bafbb4c6cd4cc5L, 0x83327c6de8729b3fL, 0x51dcaa29974fc1a2L, 0x51dcaa29974fc1a8L, "size");
  }
}
