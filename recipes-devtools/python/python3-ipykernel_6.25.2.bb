
SUMMARY = "IPython Kernel for Jupyter"
HOMEPAGE = ""
AUTHOR = " <IPython Development Team <ipython-dev@scipy.org>>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=159b7ae0b4f7071ca9f0295354f6a49e"

SRC_URI[sha256sum] = "f468ddd1f17acb48c8ce67fcfa49ba6d46d4f9ac0438c1f441be7c3d1372230b"

DEPENDS += "\
    python3-jupyter-client-native \
"

inherit pypi python_hatchling

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-comm \
    ${PYTHON_PN}-debugpy \
    ${PYTHON_PN}-ipython \
    ${PYTHON_PN}-jupyter-client \
    ${PYTHON_PN}-jupyter-core \
    ${PYTHON_PN}-matplotlib-inline \
    ${PYTHON_PN}-nest-asyncio \
    ${PYTHON_PN}-packaging \
    ${PYTHON_PN}-ptyprocess \
    ${PYTHON_PN}-modules \
    ${PYTHON_PN}-psutil \
    ${PYTHON_PN}-pyzmq \
    ${PYTHON_PN}-tornado \
    ${PYTHON_PN}-traitlets \
"

BBCLASSEXTEND = "native nativesdk"

FILES:${PN} += "\
    /usr/share \
    /usr/share/jupyter \
    /usr/share/jupyter/kernels \
    /usr/share/jupyter/kernels/python3 \
    /usr/share/jupyter/kernels/python3/kernel.json \
    /usr/share/jupyter/kernels/python3/logo-svg.svg \
    /usr/share/jupyter/kernels/python3/logo-64x64.png \
    /usr/share/jupyter/kernels/python3/logo-32x32.png \
  "